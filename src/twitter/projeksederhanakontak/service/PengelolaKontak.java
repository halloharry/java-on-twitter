package twitter.projeksederhanakontak.service;

import twitter.oop.exceptionn.MyCustomException;
import twitter.projeksederhanakontak.service.impl.KontakServiceImpl;

import java.util.List;

public interface PengelolaKontak {

    List<KontakServiceImpl> tambahKontak();

    void menampilkanKontak(List<KontakServiceImpl> listKontak);

    void hapusKontak(List<KontakServiceImpl> kontakList) throws MyCustomException;
}
