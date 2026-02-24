package programmershinobi.restful.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import programmershinobi.restful.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
