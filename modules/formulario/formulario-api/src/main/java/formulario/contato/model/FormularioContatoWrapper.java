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
 * This class is a wrapper for {@link FormularioContato}.
 * </p>
 *
 * @author Eglen
 * @see FormularioContato
 * @generated
 */
public class FormularioContatoWrapper
	extends BaseModelWrapper<FormularioContato>
	implements FormularioContato, ModelWrapper<FormularioContato> {

	public FormularioContatoWrapper(FormularioContato formularioContato) {
		super(formularioContato);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("uuid", getUuid());
		attributes.put("formularioId", getFormularioId());
		attributes.put("nome", getNome());
		attributes.put("email", getEmail());
		attributes.put("estado", getEstado());
		attributes.put("cidade", getCidade());
		attributes.put("mensagem", getMensagem());
		attributes.put("protocolo", getProtocolo());
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

		Long formularioId = (Long)attributes.get("formularioId");

		if (formularioId != null) {
			setFormularioId(formularioId);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String cidade = (String)attributes.get("cidade");

		if (cidade != null) {
			setCidade(cidade);
		}

		String mensagem = (String)attributes.get("mensagem");

		if (mensagem != null) {
			setMensagem(mensagem);
		}

		String protocolo = (String)attributes.get("protocolo");

		if (protocolo != null) {
			setProtocolo(protocolo);
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
	 * Returns the cidade of this formulario contato.
	 *
	 * @return the cidade of this formulario contato
	 */
	@Override
	public String getCidade() {
		return model.getCidade();
	}

	/**
	 * Returns the company ID of this formulario contato.
	 *
	 * @return the company ID of this formulario contato
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this formulario contato.
	 *
	 * @return the create date of this formulario contato
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email of this formulario contato.
	 *
	 * @return the email of this formulario contato
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the estado of this formulario contato.
	 *
	 * @return the estado of this formulario contato
	 */
	@Override
	public String getEstado() {
		return model.getEstado();
	}

	/**
	 * Returns the formulario ID of this formulario contato.
	 *
	 * @return the formulario ID of this formulario contato
	 */
	@Override
	public long getFormularioId() {
		return model.getFormularioId();
	}

	/**
	 * Returns the group ID of this formulario contato.
	 *
	 * @return the group ID of this formulario contato
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the mensagem of this formulario contato.
	 *
	 * @return the mensagem of this formulario contato
	 */
	@Override
	public String getMensagem() {
		return model.getMensagem();
	}

	/**
	 * Returns the modified date of this formulario contato.
	 *
	 * @return the modified date of this formulario contato
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the mvcc version of this formulario contato.
	 *
	 * @return the mvcc version of this formulario contato
	 */
	@Override
	public long getMvccVersion() {
		return model.getMvccVersion();
	}

	/**
	 * Returns the nome of this formulario contato.
	 *
	 * @return the nome of this formulario contato
	 */
	@Override
	public String getNome() {
		return model.getNome();
	}

	/**
	 * Returns the primary key of this formulario contato.
	 *
	 * @return the primary key of this formulario contato
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the protocolo of this formulario contato.
	 *
	 * @return the protocolo of this formulario contato
	 */
	@Override
	public String getProtocolo() {
		return model.getProtocolo();
	}

	/**
	 * Returns the status of this formulario contato.
	 *
	 * @return the status of this formulario contato
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this formulario contato.
	 *
	 * @return the status by user ID of this formulario contato
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this formulario contato.
	 *
	 * @return the status by user name of this formulario contato
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this formulario contato.
	 *
	 * @return the status by user uuid of this formulario contato
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this formulario contato.
	 *
	 * @return the status date of this formulario contato
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this formulario contato.
	 *
	 * @return the user ID of this formulario contato
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this formulario contato.
	 *
	 * @return the user name of this formulario contato
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this formulario contato.
	 *
	 * @return the user uuid of this formulario contato
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this formulario contato.
	 *
	 * @return the uuid of this formulario contato
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is approved.
	 *
	 * @return <code>true</code> if this formulario contato is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is denied.
	 *
	 * @return <code>true</code> if this formulario contato is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is a draft.
	 *
	 * @return <code>true</code> if this formulario contato is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is expired.
	 *
	 * @return <code>true</code> if this formulario contato is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is inactive.
	 *
	 * @return <code>true</code> if this formulario contato is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is incomplete.
	 *
	 * @return <code>true</code> if this formulario contato is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is pending.
	 *
	 * @return <code>true</code> if this formulario contato is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this formulario contato is scheduled.
	 *
	 * @return <code>true</code> if this formulario contato is scheduled; <code>false</code> otherwise
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
	 * Sets the cidade of this formulario contato.
	 *
	 * @param cidade the cidade of this formulario contato
	 */
	@Override
	public void setCidade(String cidade) {
		model.setCidade(cidade);
	}

	/**
	 * Sets the company ID of this formulario contato.
	 *
	 * @param companyId the company ID of this formulario contato
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this formulario contato.
	 *
	 * @param createDate the create date of this formulario contato
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email of this formulario contato.
	 *
	 * @param email the email of this formulario contato
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the estado of this formulario contato.
	 *
	 * @param estado the estado of this formulario contato
	 */
	@Override
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

	/**
	 * Sets the formulario ID of this formulario contato.
	 *
	 * @param formularioId the formulario ID of this formulario contato
	 */
	@Override
	public void setFormularioId(long formularioId) {
		model.setFormularioId(formularioId);
	}

	/**
	 * Sets the group ID of this formulario contato.
	 *
	 * @param groupId the group ID of this formulario contato
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the mensagem of this formulario contato.
	 *
	 * @param mensagem the mensagem of this formulario contato
	 */
	@Override
	public void setMensagem(String mensagem) {
		model.setMensagem(mensagem);
	}

	/**
	 * Sets the modified date of this formulario contato.
	 *
	 * @param modifiedDate the modified date of this formulario contato
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the mvcc version of this formulario contato.
	 *
	 * @param mvccVersion the mvcc version of this formulario contato
	 */
	@Override
	public void setMvccVersion(long mvccVersion) {
		model.setMvccVersion(mvccVersion);
	}

	/**
	 * Sets the nome of this formulario contato.
	 *
	 * @param nome the nome of this formulario contato
	 */
	@Override
	public void setNome(String nome) {
		model.setNome(nome);
	}

	/**
	 * Sets the primary key of this formulario contato.
	 *
	 * @param primaryKey the primary key of this formulario contato
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the protocolo of this formulario contato.
	 *
	 * @param protocolo the protocolo of this formulario contato
	 */
	@Override
	public void setProtocolo(String protocolo) {
		model.setProtocolo(protocolo);
	}

	/**
	 * Sets the status of this formulario contato.
	 *
	 * @param status the status of this formulario contato
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this formulario contato.
	 *
	 * @param statusByUserId the status by user ID of this formulario contato
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this formulario contato.
	 *
	 * @param statusByUserName the status by user name of this formulario contato
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this formulario contato.
	 *
	 * @param statusByUserUuid the status by user uuid of this formulario contato
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this formulario contato.
	 *
	 * @param statusDate the status date of this formulario contato
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this formulario contato.
	 *
	 * @param userId the user ID of this formulario contato
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this formulario contato.
	 *
	 * @param userName the user name of this formulario contato
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this formulario contato.
	 *
	 * @param userUuid the user uuid of this formulario contato
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this formulario contato.
	 *
	 * @param uuid the uuid of this formulario contato
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
	protected FormularioContatoWrapper wrap(
		FormularioContato formularioContato) {

		return new FormularioContatoWrapper(formularioContato);
	}

}