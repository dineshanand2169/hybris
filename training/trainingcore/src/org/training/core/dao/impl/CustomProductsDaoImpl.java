package org.training.core.dao.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.training.core.dao.CustomProductsDao;

import java.util.Collections;
import java.util.List;

public class CustomProductsDaoImpl implements CustomProductsDao {
    private FlexibleSearchService flexibleSearchService;

    public FlexibleSearchService getFlexibleSearchService() {
        return flexibleSearchService;
    }

    public void setFlexibleSearchService(FlexibleSearchService flexibleSearchService) {
        this.flexibleSearchService = flexibleSearchService;
    }

    @Override
    public List<ProductModel> findAllProductsWithAssortmentLevel() {
        final StringBuilder query = new StringBuilder("SELECT {pk} FROM {Product} WHERE {assortmentLevel} IS NOT NULL");
        final FlexibleSearchQuery searchQuery = new FlexibleSearchQuery(query.toString());
        searchQuery.setResultClassList(Collections.singletonList(ProductModel.class));
        final SearchResult searchResult = getFlexibleSearchService().search(searchQuery);
        return searchResult.getResult();
    }
}
