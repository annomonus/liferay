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

package com.liferay.portlet.journal.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.journal.model.JournalTemplate;
import com.liferay.portlet.journal.service.JournalTemplateLocalServiceUtil;

/**
 * The extended model base implementation for the JournalTemplate service. Represents a row in the &quot;JournalTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link JournalTemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JournalTemplateImpl
 * @see com.liferay.portlet.journal.model.JournalTemplate
 * @generated
 */
public abstract class JournalTemplateBaseImpl extends JournalTemplateModelImpl
	implements JournalTemplate {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a journal template model instance should use the {@link JournalTemplate} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			JournalTemplateLocalServiceUtil.addJournalTemplate(this);
		}
		else {
			JournalTemplateLocalServiceUtil.updateJournalTemplate(this);
		}
	}
}