package program.mesin;

import program.mesin.exceptionn.ExceptionCustomMe;

public interface MesinService {
    void beli(String item, int uangPecahan) throws ExceptionCustomMe;
}
