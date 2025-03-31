package kr.ac.hansung.cse.service;

import java.util.List;
import kr.ac.hansung.cse.dao.OfferDao;
import kr.ac.hansung.cse.model.Offer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferService {
    @Autowired
    private OfferDao offerDao;

    public List<Offer> getAllOffers() {
        return offerDao.getOffers();
    }
}
