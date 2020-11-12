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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Municipio service. Represents a row in the &quot;FC_Municipio&quot; database table, with each column mapped to a property of this class.
 *
 * @author Eglen
 * @see MunicipioModel
 * @generated
 */
@ImplementationClassName("formulario.contato.model.impl.MunicipioImpl")
@ProviderType
public interface Municipio extends MunicipioModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>formulario.contato.model.impl.MunicipioImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Municipio, Long> MUNICIPIO_ID_ACCESSOR =
		new Accessor<Municipio, Long>() {

			@Override
			public Long get(Municipio municipio) {
				return municipio.getMunicipioId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Municipio> getTypeClass() {
				return Municipio.class;
			}

		};

}