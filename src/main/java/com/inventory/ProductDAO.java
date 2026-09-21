package com.inventory;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {

    // CREATE
    public void addProduct(Product product) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.persist(product);

            transaction.commit();

            System.out.println("Product added successfully.");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
    }


    // READ - Get product by ID
    public Product getProduct(int id) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Product.class, id);

        } catch (Exception e) {

            e.printStackTrace();

            return null;
        }
    }


    // READ - Get all products
    public List<Product> getAllProducts() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session
                    .createQuery("from Product", Product.class)
                    .getResultList();

        } catch (Exception e) {

            e.printStackTrace();

            return null;
        }
    }


    // UPDATE
    public void updateProduct(Product product) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.merge(product);

            transaction.commit();

            System.out.println("Product updated successfully.");

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
    }


    // DELETE
    public void deleteProduct(int id) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Product product = session.get(Product.class, id);

            if (product != null) {

                session.remove(product);

                System.out.println("Product deleted successfully.");

            } else {

                System.out.println("Product not found.");
            }

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        }
    }
}