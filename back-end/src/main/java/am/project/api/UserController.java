package am.project.api;

import am.project.dto.user.UserInfoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserController {

    Page<UserInfoDTO> findAllUsers(Pageable pageable);

    Page<UserInfoDTO> searchByName(String fullName, Pageable pageable);

    void remove(Long id);

    void update(UserInfoDTO user);

}
