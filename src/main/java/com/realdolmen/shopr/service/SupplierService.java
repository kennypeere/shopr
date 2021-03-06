package com.realdolmen.shopr.service;


import com.realdolmen.shopr.domain.SupplierOrder;
import com.realdolmen.shopr.exception.SupplierException;

import javax.ejb.Stateless;

@Stateless
public class SupplierService {

    public void order(SupplierOrder order) throws SupplierException {
        if (shouldThrowException(order)) {
            throw new SupplierException();
        }

        // Negeer onderstaande code even...
        System.out.println(order.getClientReference()
                + "-" + order.getArticleId()
                + "-" + order.getNumberOfArticles());
    }

    protected boolean shouldThrowException(SupplierOrder order) {
        return order.getNumberOfArticles() % 3 == 0;
    }
}
