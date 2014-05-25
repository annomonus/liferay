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

package com.liferay.portlet.softwarecatalog.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.AuditedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SCProductVersion service. Represents a row in the &quot;SCProductVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SCProductVersion
 * @see com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionImpl
 * @see com.liferay.portlet.softwarecatalog.model.impl.SCProductVersionModelImpl
 * @generated
 */
public interface SCProductVersionModel extends AuditedModel,
	BaseModel<SCProductVersion> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a s c product version model instance should use the {@link SCProductVersion} interface instead.
	 */

	/**
	 * Returns the primary key of this s c product version.
	 *
	 * @return the primary key of this s c product version
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s c product version.
	 *
	 * @param primaryKey the primary key of this s c product version
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the product version ID of this s c product version.
	 *
	 * @return the product version ID of this s c product version
	 */
	public long getProductVersionId();

	/**
	 * Sets the product version ID of this s c product version.
	 *
	 * @param productVersionId the product version ID of this s c product version
	 */
	public void setProductVersionId(long productVersionId);

	/**
	 * Returns the company ID of this s c product version.
	 *
	 * @return the company ID of this s c product version
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this s c product version.
	 *
	 * @param companyId the company ID of this s c product version
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this s c product version.
	 *
	 * @return the user ID of this s c product version
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this s c product version.
	 *
	 * @param userId the user ID of this s c product version
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this s c product version.
	 *
	 * @return the user uuid of this s c product version
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this s c product version.
	 *
	 * @param userUuid the user uuid of this s c product version
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this s c product version.
	 *
	 * @return the user name of this s c product version
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this s c product version.
	 *
	 * @param userName the user name of this s c product version
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this s c product version.
	 *
	 * @return the create date of this s c product version
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this s c product version.
	 *
	 * @param createDate the create date of this s c product version
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this s c product version.
	 *
	 * @return the modified date of this s c product version
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this s c product version.
	 *
	 * @param modifiedDate the modified date of this s c product version
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the product entry ID of this s c product version.
	 *
	 * @return the product entry ID of this s c product version
	 */
	public long getProductEntryId();

	/**
	 * Sets the product entry ID of this s c product version.
	 *
	 * @param productEntryId the product entry ID of this s c product version
	 */
	public void setProductEntryId(long productEntryId);

	/**
	 * Returns the version of this s c product version.
	 *
	 * @return the version of this s c product version
	 */
	@AutoEscape
	public String getVersion();

	/**
	 * Sets the version of this s c product version.
	 *
	 * @param version the version of this s c product version
	 */
	public void setVersion(String version);

	/**
	 * Returns the change log of this s c product version.
	 *
	 * @return the change log of this s c product version
	 */
	@AutoEscape
	public String getChangeLog();

	/**
	 * Sets the change log of this s c product version.
	 *
	 * @param changeLog the change log of this s c product version
	 */
	public void setChangeLog(String changeLog);

	/**
	 * Returns the download page u r l of this s c product version.
	 *
	 * @return the download page u r l of this s c product version
	 */
	@AutoEscape
	public String getDownloadPageURL();

	/**
	 * Sets the download page u r l of this s c product version.
	 *
	 * @param downloadPageURL the download page u r l of this s c product version
	 */
	public void setDownloadPageURL(String downloadPageURL);

	/**
	 * Returns the direct download u r l of this s c product version.
	 *
	 * @return the direct download u r l of this s c product version
	 */
	@AutoEscape
	public String getDirectDownloadURL();

	/**
	 * Sets the direct download u r l of this s c product version.
	 *
	 * @param directDownloadURL the direct download u r l of this s c product version
	 */
	public void setDirectDownloadURL(String directDownloadURL);

	/**
	 * Returns the repo store artifact of this s c product version.
	 *
	 * @return the repo store artifact of this s c product version
	 */
	public boolean getRepoStoreArtifact();

	/**
	 * Returns <code>true</code> if this s c product version is repo store artifact.
	 *
	 * @return <code>true</code> if this s c product version is repo store artifact; <code>false</code> otherwise
	 */
	public boolean isRepoStoreArtifact();

	/**
	 * Sets whether this s c product version is repo store artifact.
	 *
	 * @param repoStoreArtifact the repo store artifact of this s c product version
	 */
	public void setRepoStoreArtifact(boolean repoStoreArtifact);

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

	public int compareTo(SCProductVersion scProductVersion);

	public int hashCode();

	public CacheModel<SCProductVersion> toCacheModel();

	public SCProductVersion toEscapedModel();

	public String toString();

	public String toXmlString();
}