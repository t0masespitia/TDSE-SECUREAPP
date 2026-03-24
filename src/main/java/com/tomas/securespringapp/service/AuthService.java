package com.tomas.securespringapp.service;

import com.tomas.securespringapp.dto.LoginRequest;
import com.tomas.securespringapp.dto.RegisterRequest;
import com.tomas.securespringapp.model.User;
import com.tomas.securespringapp.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public String register(RegisterRequest request) {
        if (userRepository.existsByUsername(request.getUsername())) {
            return "El nombre de usuario ya existe";
        }

        if (userRepository.existsByEmail(request.getEmail())) {
            return "El correo ya existe";
        }

        User user = new User(
                request.getUsername(),
                request.getEmail(),
                passwordEncoder.encode(request.getPassword())
        );

        userRepository.save(user);
        return "Usuario registrado correctamente";
    }

    public String login(LoginRequest request) {
        Optional<User> userOptional = userRepository.findByUsername(request.getUsername());

        if (userOptional.isEmpty()) {
            return "Usuario no encontrado";
        }

        User user = userOptional.get();

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            return "Contraseña incorrecta";
        }

        return "Login exitoso";
    }
}