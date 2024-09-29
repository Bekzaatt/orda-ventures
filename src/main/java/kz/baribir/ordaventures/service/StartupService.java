package kz.baribir.ordaventures.service;

import kz.baribir.ordaventures.model.Startup;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StartupService{
    Startup create(Startup startup); // Создание нового стартапа
    Startup getStartupByUserId(Long id); // Получение стартапа по ID
    List<Startup> getAllStartups(); // Получение списка всех стартапов
    Startup update(Startup updatedStartup); // Обновление стартапа
    void deleteStartup(Long id); // Удаление стартапа
}
