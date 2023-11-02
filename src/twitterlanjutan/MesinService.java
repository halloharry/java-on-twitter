package twitterlanjutan;

import twitterlanjutan.exceptionn.ExceptionCustomMe;

public interface MesinService {
    void beli(String item, int uangPecahan) throws ExceptionCustomMe;
}
