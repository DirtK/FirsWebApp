package ru.moneybranch.webapp.interfaces;

import java.util.List;

/**
 * stanley
 * 04.01.18.
 */
public interface Skilsable {

    List<String> getSubTitleList();
    void setSubTitleList(List<String> subTitleList);

    List<String> getApplicationServerList();
    void setApplicationServerList(List<String> applicationServerList);

    List<String> getVersionControlList();
    void setVersionControlList(List<String> versionControlList);

    List<String> getDataBaseList();
    void setDataBaseList(List<String> dataBaseList);

    List<String> getLanguageList();
    void setLanguageList(List<String> languageList);

    List<String> getFrameworkList();
    void setFrameworkList(List<String> frameworkList);

    List<String> getTechnologyList();
    void setTechnologyList(List<String> technologyList);

    List<String> getInstrumentList();
    void setInstrumentList(List<String> instrumentList);

    String getOther();
    void setOther(String  other);

}
