

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author akne
 * @since 2024-01-06
 */
@RestController
@RequestMapping("/user")
public class AdminController {
    @GetMapping
    public String findAll() {
        return "111111";
    }
}

