package br.ueg.genericarchitecture.controller;

import br.ueg.genericarchitecture.dto.AuthDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface IAuthController {
    ResponseEntity<?> login(@RequestBody @Valid AuthDTO authDTO);
    ResponseEntity<?> refresh(@RequestParam String refreshToken);
    ResponseEntity<?> logout(HttpServletRequest request);
}
