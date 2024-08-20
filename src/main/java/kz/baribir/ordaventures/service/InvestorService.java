package kz.baribir.ordaventures.service;

import kz.baribir.ordaventures.model.Investor;

import java.util.List;

public interface InvestorService {

    Investor create(Investor investor); // Создание нового инвестора
    Investor getInvestorByUserId(Long id); // Получение инвестора по ID
    List<Investor> getAllInvestors(); // Получение списка всех инвесторов
    Investor update(Investor updatedInvestor); // Обновление данных инвестора
    void delete(Long id); // Удаление инвестора
}
