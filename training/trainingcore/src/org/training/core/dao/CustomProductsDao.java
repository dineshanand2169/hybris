package org.training.core.dao;

import de.hybris.platform.core.model.product.ProductModel;

import java.util.List;

public interface CustomProductsDao {
    List<ProductModel> findAllProductsWithAssortmentLevel();
}
