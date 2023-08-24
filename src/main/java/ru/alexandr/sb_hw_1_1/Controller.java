package ru.alexandr.sb_hw_1_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
    private SystemProfile systemProfile;

    public Controller (SystemProfile systemProfile) {
        this.systemProfile = systemProfile;
    }

    @GetMapping("profile")
    public String getProfile() {
        return systemProfile.getProfile();
    }
}
