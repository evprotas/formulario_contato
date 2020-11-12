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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link formulario.contato.service.http.FormularioContatoServiceSoap}.
 *
 * @author Eglen
 * @generated
 */
public class FormularioContatoSoap implements Serializable {

	public static FormularioContatoSoap toSoapModel(FormularioContato model) {
		FormularioContatoSoap soapModel = new FormularioContatoSoap();

		soapModel.setMvccVersion(model.getMvccVersion());
		soapModel.setUuid(model.getUuid());
		soapModel.setFormularioId(model.getFormularioId());
		soapModel.setNome(model.getNome());
		soapModel.setEmail(model.getEmail());
		soapModel.setEstado(model.getEstado());
		soapModel.setCidade(model.getCidade());
		soapModel.setMensagem(model.getMensagem());
		soapModel.setProtocolo(model.getProtocolo());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static FormularioContatoSoap[] toSoapModels(
		FormularioContato[] models) {

		FormularioContatoSoap[] soapModels =
			new FormularioContatoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static FormularioContatoSoap[][] toSoapModels(
		FormularioContato[][] models) {

		FormularioContatoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new FormularioContatoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new FormularioContatoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static FormularioContatoSoap[] toSoapModels(
		List<FormularioContato> models) {

		List<FormularioContatoSoap> soapModels =
			new ArrayList<FormularioContatoSoap>(models.size());

		for (FormularioContato model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new FormularioContatoSoap[soapModels.size()]);
	}

	public FormularioContatoSoap() {
	}

	public long getPrimaryKey() {
		return _formularioId;
	}

	public void setPrimaryKey(long pk) {
		setFormularioId(pk);
	}

	public long getMvccVersion() {
		return _mvccVersion;
	}

	public void setMvccVersion(long mvccVersion) {
		_mvccVersion = mvccVersion;
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFormularioId() {
		return _formularioId;
	}

	public void setFormularioId(long formularioId) {
		_formularioId = formularioId;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public String getCidade() {
		return _cidade;
	}

	public void setCidade(String cidade) {
		_cidade = cidade;
	}

	public String getMensagem() {
		return _mensagem;
	}

	public void setMensagem(String mensagem) {
		_mensagem = mensagem;
	}

	public String getProtocolo() {
		return _protocolo;
	}

	public void setProtocolo(String protocolo) {
		_protocolo = protocolo;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private long _mvccVersion;
	private String _uuid;
	private long _formularioId;
	private String _nome;
	private String _email;
	private String _estado;
	private String _cidade;
	private String _mensagem;
	private String _protocolo;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;

}