/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.ThuCung;

/**
 *
 * @author Ngo Duy Linh
 */
public interface ThuCungService {

    String add(ThuCung tc);

    List<ThuCung> getAll();

    String updateTC(ThuCung tc, String maTC);

    String removeTC(String maTC);

    ThuCung getOne(String maTC);

    List<ThuCung> getByMa(String maTC);
}
