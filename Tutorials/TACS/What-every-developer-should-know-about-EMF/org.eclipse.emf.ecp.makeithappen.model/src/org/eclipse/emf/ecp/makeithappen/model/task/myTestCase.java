/*******************************************************************************
 * Copyright (c) 2011-2023 EclipseSource Muenchen GmbH and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * Joana - initial API and implementation
 ******************************************************************************/
package org.eclipse.emf.ecp.makeithappen.model.task;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;

/**
 * @author Joana
 *
 */
class myTestCase {

	@Test
	void test() {
		final Adress adress = TaskFactory.eINSTANCE.createAdress();
		adress.setCountry("France");
		adress.setStreet("StreetA");
		final UserGroup userGroup = TaskFactory.eINSTANCE.createUserGroup();
		final User user = TaskFactory.eINSTANCE.createUser();

		userGroup.getUsers().add(user);

		final EList<EAttribute> allAttributes = adress.eClass().getEAllAttributes();
		for (final EAttribute eAttribute : allAttributes) {
			adress.eUnset(eAttribute);
		}

		final Adress copy = EcoreUtil.copy(adress);
	}

}
