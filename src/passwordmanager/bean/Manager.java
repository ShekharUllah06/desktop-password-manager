/*
 * Copyright (C) 2017 Abdullah Shekhar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package passwordmanager.bean;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Abdullah Shekhar
 */
public class Manager {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PasswordManagerPU");
    EntityManager em;

    public boolean persist(Object object) {
        boolean isPersisted = false;
        em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
            isPersisted = true;
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return isPersisted;
    }

    public void updateEntity(Object object) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();
        em.close();
    }

    public void deleteEntity(Object object) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        if (!em.contains(object)) {
            object = em.merge(object);
        }
        em.remove(object);
        em.getTransaction().commit();
        em.close();
    }

    public Collection<AccountInfo> findAllAccountInfo() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("SELECT e FROM AccountInfo e");
        Collection<AccountInfo> ai = query.getResultList();
        em.close();
        return ai;
    }

}
