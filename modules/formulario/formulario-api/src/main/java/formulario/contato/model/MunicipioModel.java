/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package formulario.contato.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Municipio service. Represents a row in the &quot;FC_Municipio&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>formulario.contato.model.impl.MunicipioModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>formulario.contato.model.impl.MunicipioImpl</code>.
 * </p>
 *
 * @author Eglen
 * @see Municipio
 * @generated
 */
@ProviderType
public interface MunicipioModel
	extends BaseModel<Municipio>, GroupedModel, MVCCModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a municipio model instance should use the {@link Municipio} interface instead.
	 */

	/**
	 * Returns the primary key of this municipio.
	 *
	 * @return the primary key of this municipio
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this municipio.
	 *
	 * @param primaryKey the primary key of this municipio
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this municipio.
	 *
	 * @return the mvcc version of this municipio
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this municipio.
	 *
	 * @param mvccVersion the mvcc version of this municipio
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this municipio.
	 *
	 * @return the uuid of this municipio
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this municipio.
	 *
	 * @param uuid the uuid of this municipio
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the municipio ID of this municipio.
	 *
	 * @return the municipio ID of this municipio
	 */
	public long getMunicipioId();

	/**
	 * Sets the municipio ID of this municipio.
	 *
	 * @param municipioId the municipio ID of this municipio
	 */
	public void setMunicipioId(long municipioId);

	/**
	 * Returns the nome of this municipio.
	 *
	 * @return the nome of this municipio
	 */
	@AutoEscape
	public String getNome();

	/**
	 * Sets the nome of this municipio.
	 *
	 * @param nome the nome of this municipio
	 */
	public void setNome(String nome);

	/**
	 * Returns the codigo of this municipio.
	 *
	 * @return the codigo of this municipio
	 */
	@AutoEscape
	public String getCodigo();

	/**
	 * Sets the codigo of this municipio.
	 *
	 * @param codigo the codigo of this municipio
	 */
	public void setCodigo(String codigo);

	/**
	 * Returns the estado ID of this municipio.
	 *
	 * @return the estado ID of this municipio
	 */
	public long getEstadoId();

	/**
	 * Sets the estado ID of this municipio.
	 *
	 * @param estadoId the estado ID of this municipio
	 */
	public void setEstadoId(long estadoId);

	/**
	 * Returns the group ID of this municipio.
	 *
	 * @return the group ID of this municipio
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this municipio.
	 *
	 * @param groupId the group ID of this municipio
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this municipio.
	 *
	 * @return the company ID of this municipio
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this municipio.
	 *
	 * @param companyId the company ID of this municipio
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this municipio.
	 *
	 * @return the user ID of this municipio
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this municipio.
	 *
	 * @param userId the user ID of this municipio
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this municipio.
	 *
	 * @return the user uuid of this municipio
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this municipio.
	 *
	 * @param userUuid the user uuid of this municipio
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this municipio.
	 *
	 * @return the user name of this municipio
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this municipio.
	 *
	 * @param userName the user name of this municipio
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this municipio.
	 *
	 * @return the create date of this municipio
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this municipio.
	 *
	 * @param createDate the create date of this municipio
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this municipio.
	 *
	 * @return the modified date of this municipio
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this municipio.
	 *
	 * @param modifiedDate the modified date of this municipio
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this municipio.
	 *
	 * @return the status of this municipio
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this municipio.
	 *
	 * @param status the status of this municipio
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this municipio.
	 *
	 * @return the status by user ID of this municipio
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this municipio.
	 *
	 * @param statusByUserId the status by user ID of this municipio
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this municipio.
	 *
	 * @return the status by user uuid of this municipio
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this municipio.
	 *
	 * @param statusByUserUuid the status by user uuid of this municipio
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this municipio.
	 *
	 * @return the status by user name of this municipio
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this municipio.
	 *
	 * @param statusByUserName the status by user name of this municipio
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this municipio.
	 *
	 * @return the status date of this municipio
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this municipio.
	 *
	 * @param statusDate the status date of this municipio
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns <code>true</code> if this municipio is approved.
	 *
	 * @return <code>true</code> if this municipio is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this municipio is denied.
	 *
	 * @return <code>true</code> if this municipio is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this municipio is a draft.
	 *
	 * @return <code>true</code> if this municipio is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this municipio is expired.
	 *
	 * @return <code>true</code> if this municipio is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this municipio is inactive.
	 *
	 * @return <code>true</code> if this municipio is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this municipio is incomplete.
	 *
	 * @return <code>true</code> if this municipio is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this municipio is pending.
	 *
	 * @return <code>true</code> if this municipio is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this municipio is scheduled.
	 *
	 * @return <code>true</code> if this municipio is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

}