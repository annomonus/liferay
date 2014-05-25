/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.shopping.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ShoppingItemPrice service. Represents a row in the &quot;ShoppingItemPrice&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.shopping.model.impl.ShoppingItemPriceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.shopping.model.impl.ShoppingItemPriceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShoppingItemPrice
 * @see com.liferay.portlet.shopping.model.impl.ShoppingItemPriceImpl
 * @see com.liferay.portlet.shopping.model.impl.ShoppingItemPriceModelImpl
 * @generated
 */
public interface ShoppingItemPriceModel extends BaseModel<ShoppingItemPrice> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a shopping item price model instance should use the {@link ShoppingItemPrice} interface instead.
	 */

	/**
	 * Returns the primary key of this shopping item price.
	 *
	 * @return the primary key of this shopping item price
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this shopping item price.
	 *
	 * @param primaryKey the primary key of this shopping item price
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the item price ID of this shopping item price.
	 *
	 * @return the item price ID of this shopping item price
	 */
	public long getItemPriceId();

	/**
	 * Sets the item price ID of this shopping item price.
	 *
	 * @param itemPriceId the item price ID of this shopping item price
	 */
	public void setItemPriceId(long itemPriceId);

	/**
	 * Returns the item ID of this shopping item price.
	 *
	 * @return the item ID of this shopping item price
	 */
	public long getItemId();

	/**
	 * Sets the item ID of this shopping item price.
	 *
	 * @param itemId the item ID of this shopping item price
	 */
	public void setItemId(long itemId);

	/**
	 * Returns the min quantity of this shopping item price.
	 *
	 * @return the min quantity of this shopping item price
	 */
	public int getMinQuantity();

	/**
	 * Sets the min quantity of this shopping item price.
	 *
	 * @param minQuantity the min quantity of this shopping item price
	 */
	public void setMinQuantity(int minQuantity);

	/**
	 * Returns the max quantity of this shopping item price.
	 *
	 * @return the max quantity of this shopping item price
	 */
	public int getMaxQuantity();

	/**
	 * Sets the max quantity of this shopping item price.
	 *
	 * @param maxQuantity the max quantity of this shopping item price
	 */
	public void setMaxQuantity(int maxQuantity);

	/**
	 * Returns the price of this shopping item price.
	 *
	 * @return the price of this shopping item price
	 */
	public double getPrice();

	/**
	 * Sets the price of this shopping item price.
	 *
	 * @param price the price of this shopping item price
	 */
	public void setPrice(double price);

	/**
	 * Returns the discount of this shopping item price.
	 *
	 * @return the discount of this shopping item price
	 */
	public double getDiscount();

	/**
	 * Sets the discount of this shopping item price.
	 *
	 * @param discount the discount of this shopping item price
	 */
	public void setDiscount(double discount);

	/**
	 * Returns the taxable of this shopping item price.
	 *
	 * @return the taxable of this shopping item price
	 */
	public boolean getTaxable();

	/**
	 * Returns <code>true</code> if this shopping item price is taxable.
	 *
	 * @return <code>true</code> if this shopping item price is taxable; <code>false</code> otherwise
	 */
	public boolean isTaxable();

	/**
	 * Sets whether this shopping item price is taxable.
	 *
	 * @param taxable the taxable of this shopping item price
	 */
	public void setTaxable(boolean taxable);

	/**
	 * Returns the shipping of this shopping item price.
	 *
	 * @return the shipping of this shopping item price
	 */
	public double getShipping();

	/**
	 * Sets the shipping of this shopping item price.
	 *
	 * @param shipping the shipping of this shopping item price
	 */
	public void setShipping(double shipping);

	/**
	 * Returns the use shipping formula of this shopping item price.
	 *
	 * @return the use shipping formula of this shopping item price
	 */
	public boolean getUseShippingFormula();

	/**
	 * Returns <code>true</code> if this shopping item price is use shipping formula.
	 *
	 * @return <code>true</code> if this shopping item price is use shipping formula; <code>false</code> otherwise
	 */
	public boolean isUseShippingFormula();

	/**
	 * Sets whether this shopping item price is use shipping formula.
	 *
	 * @param useShippingFormula the use shipping formula of this shopping item price
	 */
	public void setUseShippingFormula(boolean useShippingFormula);

	/**
	 * Returns the status of this shopping item price.
	 *
	 * @return the status of this shopping item price
	 */
	public int getStatus();

	/**
	 * Sets the status of this shopping item price.
	 *
	 * @param status the status of this shopping item price
	 */
	public void setStatus(int status);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(ShoppingItemPrice shoppingItemPrice);

	public int hashCode();

	public CacheModel<ShoppingItemPrice> toCacheModel();

	public ShoppingItemPrice toEscapedModel();

	public String toString();

	public String toXmlString();
}