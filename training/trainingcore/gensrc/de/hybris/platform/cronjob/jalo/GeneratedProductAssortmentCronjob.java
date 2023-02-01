/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 19-Jan-2023, 2:28:08 pm                     ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2023 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cronjob.jalo;

import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.training.core.constants.TrainingCoreConstants;

/**
 * Generated class for type {@link de.hybris.platform.cronjob.jalo.ProductAssortmentCronjob ProductAssortmentCronjob}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedProductAssortmentCronjob extends CronJob
{
	/** Qualifier of the <code>ProductAssortmentCronjob.assortmentMessage</code> attribute **/
	public static final String ASSORTMENTMESSAGE = "assortmentMessage";
	/** Qualifier of the <code>ProductAssortmentCronjob.assortmentCronJob</code> attribute **/
	public static final String ASSORTMENTCRONJOB = "assortmentCronJob";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(ASSORTMENTMESSAGE, AttributeMode.INITIAL);
		tmp.put(ASSORTMENTCRONJOB, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAssortmentCronjob.assortmentCronJob</code> attribute.
	 * @return the assortmentCronJob - Message to be displayed during CronJob.
	 */
	public List<String> getAssortmentCronJob(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, ASSORTMENTCRONJOB);
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAssortmentCronjob.assortmentCronJob</code> attribute.
	 * @return the assortmentCronJob - Message to be displayed during CronJob.
	 */
	public List<String> getAssortmentCronJob()
	{
		return getAssortmentCronJob( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAssortmentCronjob.assortmentCronJob</code> attribute. 
	 * @param value the assortmentCronJob - Message to be displayed during CronJob.
	 */
	public void setAssortmentCronJob(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, ASSORTMENTCRONJOB,value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAssortmentCronjob.assortmentCronJob</code> attribute. 
	 * @param value the assortmentCronJob - Message to be displayed during CronJob.
	 */
	public void setAssortmentCronJob(final List<String> value)
	{
		setAssortmentCronJob( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAssortmentCronjob.assortmentMessage</code> attribute.
	 * @return the assortmentMessage - Timely Assortment Message.
	 */
	public String getAssortmentMessage(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ASSORTMENTMESSAGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ProductAssortmentCronjob.assortmentMessage</code> attribute.
	 * @return the assortmentMessage - Timely Assortment Message.
	 */
	public String getAssortmentMessage()
	{
		return getAssortmentMessage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAssortmentCronjob.assortmentMessage</code> attribute. 
	 * @param value the assortmentMessage - Timely Assortment Message.
	 */
	public void setAssortmentMessage(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ASSORTMENTMESSAGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ProductAssortmentCronjob.assortmentMessage</code> attribute. 
	 * @param value the assortmentMessage - Timely Assortment Message.
	 */
	public void setAssortmentMessage(final String value)
	{
		setAssortmentMessage( getSession().getSessionContext(), value );
	}
	
}
