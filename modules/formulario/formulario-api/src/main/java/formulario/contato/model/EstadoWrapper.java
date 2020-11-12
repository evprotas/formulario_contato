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
 * This class is a wrapper for {@link Estado}.
 * </p>
 *
 * @author Eglen
 * @see Estado
 * @generated
 */
public class EstadoWrapper
	extends BaseModelWrapper<Estado> implements Estado, ModelWrapper<Estado> {

	public EstadoWrapper(Estado estado) {
		super(estado);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("estadoId", getEstadoId());
		attributes.put("nome", getNome());
		attributes.put("sigla", getSigla());
		attributes.put("codigo", getCodigo());
		attributes.put("cidade", getCidade());
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

		Long estadoId = (Long)attributes.get("estadoId");

		if (estadoId != null) {
			setEstadoId(estadoId);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String sigla = (String)attributes.get("sigla");

		if (sigla != null) {
			setSigla(sigla);
		}

		String codigo = (String)attributes.get("codigo");

		if (codigo != null) {
			setCodigo(codigo);
		}

		String cidade = (String)attributes.get("cidade");

		if (cidade != null) {
			setCidade(cidade);
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
	 * Returns the cidade of this estado.
	 *
	 * @return the cidade of this estado
	 */
	@Override
	public String getCidade() {
		return model.getCidade();
	}

	/**
	 * Returns the codigo of this estado.
	 *
	 * @return the codigo of this estado
	 */
	@Override
	public String getCodigo() {
		return model.getCodigo();
	}

	/**
	 * Returns the company ID of this estado.
	 *
	 * @return the company ID of this estado
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this estado.
	 *
	 * @return the create date of this estado
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the estado ID of this estado.
	 *
	 * @return the estado ID of this estado
	 */
	@Override
	public long getEstadoId() {
		return model.getEstadoId();
	}

	/**
	 * Returns the group ID of this estado.
	 *
	 * @return the group ID of this estado
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this estado.
	 *
	 * @return the modified date of this estado
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this estado.
	 *
	 * @return the mvcc version of this estado
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the nome of this estado.
	 *
	 * @return the nome of this estado
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the primary key of this estado.
	 *
	 * @return the primary key of this estado
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sigla of this estado.
	 *
	 * @return the sigla of this estado
	 */
	@Override
	public String getSigla() {
		return model.getSigla();
	}

	/**
	 * Returns the status of this estado.
	 *
	 * @return the status of this estado
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this estado.
	 *
	 * @return the status by user ID of this estado
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this estado.
	 *
	 * @return the status by user name of this estado
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this estado.
	 *
	 * @return the status by user uuid of this estado
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this estado.
	 *
	 * @return the status date of this estado
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this estado.
	 *
	 * @return the user ID of this estado
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this estado.
	 *
	 * @return the user name of this estado
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this estado.
	 *
	 * @return the user uuid of this estado
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this estado.
	 *
	 * @return the uuid of this estado
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this estado is approved.
	 *
	 * @return <code>true</code> if this estado is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this estado is denied.
	 *
	 * @return <code>true</code> if this estado is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this estado is a draft.
	 *
	 * @return <code>true</code> if this estado is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this estado is expired.
	 *
	 * @return <code>true</code> if this estado is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this estado is inactive.
	 *
	 * @return <code>true</code> if this estado is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this estado is incomplete.
	 *
	 * @return <code>true</code> if this estado is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this estado is pending.
	 *
	 * @return <code>true</code> if this estado is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this estado is scheduled.
	 *
	 * @return <code>true</code> if this estado is scheduled; <code>false</code> otherwise
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
	 * Sets the cidade of this estado.
	 *
	 * @param cidade the cidade of this estado
	 */
	@Override
	public void setCidade(String cidade) {
		model.setCidade(cidade);
	}

	/**
	 * Sets the codigo of this estado.
	 *
	 * @param codigo the codigo of this estado
	 */
	@Override
	public void setCodigo(String codigo) {
		model.setCodigo(codigo);
	}

	/**
	 * Sets the company ID of this estado.
	 *
	 * @param companyId the company ID of this estado
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this estado.
	 *
	 * @param createDate the create date of this estado
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the estado ID of this estado.
	 *
	 * @param estadoId the estado ID of this estado
	 */
	@Override
	public void setEstadoId(long estadoId) {
		model.setEstadoId(estadoId);
	}

	/**
	 * Sets the group ID of this estado.
	 *
	 * @param groupId the group ID of this estado
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this estado.
	 *
	 * @param modifiedDate the modified date of this estado
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this estado.
	 *
	 * @param mvccVersion the mvcc version of this estado
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the nome of this estado.
	 *
	 * @param nome the nome of this estado
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the primary key of this estado.
	 *
	 * @param primaryKey the primary key of this estado
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sigla of this estado.
	 *
	 * @param sigla the sigla of this estado
	 */
	@Override
	public void setSigla(String sigla) {
		model.setSigla(sigla);
	}

	/**
	 * Sets the status of this estado.
	 *
	 * @param status the status of this estado
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this estado.
	 *
	 * @param statusByUserId the status by user ID of this estado
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this estado.
	 *
	 * @param statusByUserName the status by user name of this estado
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this estado.
	 *
	 * @param statusByUserUuid the status by user uuid of this estado
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this estado.
	 *
	 * @param statusDate the status date of this estado
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this estado.
	 *
	 * @param userId the user ID of this estado
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this estado.
	 *
	 * @param userName the user name of this estado
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this estado.
	 *
	 * @param userUuid the user uuid of this estado
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this estado.
	 *
	 * @param uuid the uuid of this estado
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
	protected EstadoWrapper wrap(Estado estado) {
		return new EstadoWrapper(estado);
	}

}