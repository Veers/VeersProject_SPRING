package com.veers.model.dao;


import com.veers.model.beans.StandaloneVO;

import java.util.List;

public interface StandaloneDAO {
    public List<StandaloneVO> findAll();

    void save(StandaloneVO standaloneVO);
}
