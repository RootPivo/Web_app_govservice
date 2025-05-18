package com.example.gosuslugipro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface UsersRepo extends JpaRepository<Users, Integer> {
    @Query("SELECT p FROM Users p WHERE CONCAT(p.ID, p.firstName, p.lastName, p.city, p.av) LIKE %?1%") public List<Users> search(String keyword);}
