package com.repository;

import com.domain.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository{

    private SessionFactory sessionFactory;

    public UserRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<User> list() {
        Session session = sessionFactory.getCurrentSession();
        Query<User> userQuery = session.createQuery("from User", User.class);
        return userQuery.getResultList();
    }

    public boolean create(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.save(user);
        return true;
    }

    public User get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(User.class, id);
    }
    public boolean  update(User employee)   {
        Session session = sessionFactory.getCurrentSession();
        //employee =session.get(User.class, id);
        session.saveOrUpdate(employee);
        return  true;
    }


    public boolean delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        User user =session.get(User.class, id);
        session.delete(user);
        return true;
    }

    /*public boolean update(Student student) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
        preparedStatement.setString(1, student.getFirstname());
        preparedStatement.setString(2, student.getLastname());
        preparedStatement.setLong(3, student.getId());
        return preparedStatement.execute();
    }

    public boolean delete(Long id) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE);
        preparedStatement.setLong(1, id);
        return preparedStatement.execute();
    }


    private List<Student> mapper(ResultSet resultSet) throws SQLException {
        List<Student> students = new ArrayList<>();
        while(resultSet.next()) {
            Student student = new Student();
            student.setId(resultSet.getLong(1));
            student.setFirstname(resultSet.getString(2));
            student.setLastname(resultSet.getString(3));
            students.add(student);
        }
        return students;
    }*/
}
