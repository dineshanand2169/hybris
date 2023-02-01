package org.training.core.job;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.training.core.dao.CustomProductsDao;

import java.util.List;
import java.util.logging.Logger;

public class ProductAssortmentJob extends AbstractJobPerformable<CronJobModel> {

    private CustomProductsDao customProductsDao;

    public CustomProductsDao getCustomProductsDao() {
        return customProductsDao;
    }

    public void setCustomProductsDao(CustomProductsDao customProductsDao) {
        this.customProductsDao = customProductsDao;
    }

    private static final Logger LOG = Logger.getLogger(ProductAssortmentJob.class.getName());


    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        List<ProductModel> productModelList = customProductsDao.findAllProductsWithAssortmentLevel();
        for (ProductModel productModel : productModelList) {
            LOG.info(productModel.getCode() + "-" + productModel.getAssortmentLevel());

        }
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
