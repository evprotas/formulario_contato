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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Municipio}.
 * </p>
 *
 * @author Eglen
 * @see Municipio
 * @generated
 */
public class MunicipioWrapper
	extends BaseModelWrapper<Municipio>
	implements ModelWrapper<Municipio>, Municipio {

	public MunicipioWrapper(Municipio municipio) {
		super(municipio);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("municipioId", getMunicipioId());
		attributes.put("nome", getNome());
		attributes.put("codigo", getCodigo());
		attributes.put("estadoId", getEstadoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long municipioId = (Long)attributes.get("municipioId");

		if (municipioId != null) {
			setMunicipioId(municipioId);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		Long estadoId = (Long)attributes.get("estadoId");

		if (estadoId != null) {
			setEstadoId(estadoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the codigo of this municipio.
	 *
	 * @return the codigo of this municipio
	 */
	@Override
	public String getCodigo() {
		return model.getCodigo();
	}

	/**
	 * Returns the company ID of this municipio.
	 *
	 * @return the company ID of this municipio
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this municipio.
	 *
	 * @return the create date of this municipio
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the estado ID of this municipio.
	 *
	 * @return the estado ID of this municipio
	 */
	@Override
	public long getEstadoId() {
		return model.getEstadoId();
	}

	/**
	 * Returns the group ID of this municipio.
	 *
	 * @return the group ID of this municipio
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this municipio.
	 *
	 * @return the modified date of this municipio
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the municipio ID of this municipio.
	 *
	 * @return the municipio ID of this municipio
	 */
	@Override
	public long getMunicipioId() {
		return model.getMunicipioId();
	}

	/**
	 * Returns the mvcc version of this municipio.
	 *
	 * @return the mvcc version of this municipio
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the nome of this municipio.
	 *
	 * @return the nome of this municipio
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the primary key of this municipio.
	 *
	 * @return the primary key of this municipio
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this municipio.
	 *
	 * @return the status of this municipio
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this municipio.
	 *
	 * @return the status by user ID of this municipio
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this municipio.
	 *
	 * @return the status by user name of this municipio
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this municipio.
	 *
	 * @return the status by user uuid of this municipio
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this municipio.
	 *
	 * @return the status date of this municipio
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this municipio.
	 *
	 * @return the user ID of this municipio
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this municipio.
	 *
	 * @return the user name of this municipio
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this municipio.
	 *
	 * @return the user uuid of this municipio
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this municipio.
	 *
	 * @return the uuid of this municipio
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this municipio is approved.
	 *
	 * @return <code>true</code> if this municipio is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this municipio is denied.
	 *
	 * @return <code>true</code> if this municipio is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this municipio is a draft.
	 *
	 * @return <code>true</code> if this municipio is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this municipio is expired.
	 *
	 * @return <code>true</code> if this municipio is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this municipio is inactive.
	 *
	 * @return <code>true</code> if this municipio is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this municipio is incomplete.
	 *
	 * @return <code>true</code> if this municipio is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this municipio is pending.
	 *
	 * @return <code>true</code> if this municipio is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this municipio is scheduled.
	 *
	 * @return <code>true</code> if this municipio is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the codigo of this municipio.
	 *
	 * @param codigo the codigo of this municipio
	 */
	@Override
	public void setCodigo(String codigo) {
		model.setCodigo(codigo);
	}

	/**
	 * Sets the company ID of this municipio.
	 *
	 * @param companyId the company ID of this municipio
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this municipio.
	 *
	 * @param createDate the create date of this municipio
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the estado ID of this municipio.
	 *
	 * @param estadoId the estado ID of this municipio
	 */
	@Override
	public void setEstadoId(long estadoId) {
		model.setEstadoId(estadoId);
	}

	/**
	 * Sets the group ID of this municipio.
	 *
	 * @param groupId the group ID of this municipio
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this municipio.
	 *
	 * @param modifiedDate the modified date of this municipio
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the municipio ID of this municipio.
	 *
	 * @param municipioId the municipio ID of this municipio
	 */
	@Override
	public void setMunicipioId(long municipioId) {
		model.setMunicipioId(municipioId);
	}

	/**
	 * Sets the mvcc version of this municipio.
	 *
	 * @param mvccVersion the mvcc version of this municipio
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the nome of this municipio.
	 *
	 * @param nome the nome of this municipio
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the primary key of this municipio.
	 *
	 * @param primaryKey the primary key of this municipio
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this municipio.
	 *
	 * @param status the status of this municipio
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this municipio.
	 *
	 * @param statusByUserId the status by user ID of this municipio
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this municipio.
	 *
	 * @param statusByUserName the status by user name of this municipio
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this municipio.
	 *
	 * @param statusByUserUuid the status by user uuid of this municipio
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this municipio.
	 *
	 * @param statusDate the status date of this municipio
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this municipio.
	 *
	 * @param userId the user ID of this municipio
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this municipio.
	 *
	 * @param userName the user name of this municipio
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this municipio.
	 *
	 * @param userUuid the user uuid of this municipio
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this municipio.
	 *
	 * @param uuid the uuid of this municipio
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected MunicipioWrapper wrap(Municipio municipio) {
		return new MunicipioWrapper(municipio);
	}

}