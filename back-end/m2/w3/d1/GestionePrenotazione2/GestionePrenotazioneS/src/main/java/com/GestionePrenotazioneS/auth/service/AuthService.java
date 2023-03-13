package com.GestionePrenotazioneS.service;

import com.GestionePrenotazioneS.payload.LoginDto;
import com.GestionePrenotazioneS.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}
