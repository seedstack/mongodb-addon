/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.mongodb.morphia.internal.specification;

import org.mongodb.morphia.mapping.Mapper;
import org.mongodb.morphia.query.CriteriaContainer;
import org.seedstack.business.specification.FalseSpecification;
import org.seedstack.business.spi.specification.SpecificationConverter;
import org.seedstack.business.spi.specification.SpecificationTranslator;


public class MorphiaFalseConverter implements SpecificationConverter<FalseSpecification<?>, MorphiaTranslationContext<?>, CriteriaContainer> {
    @Override
    public CriteriaContainer convert(FalseSpecification<?> specification, MorphiaTranslationContext<?> context, SpecificationTranslator<MorphiaTranslationContext<?>, CriteriaContainer> translator) {
        // Always false
        return context.getQuery().criteria(Mapper.ID_KEY).doesNotExist();
    }
}
