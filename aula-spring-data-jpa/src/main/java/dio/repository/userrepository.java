package dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.model.user;

public interface userrepository extends JpaRepository <user, Integer>{

}
