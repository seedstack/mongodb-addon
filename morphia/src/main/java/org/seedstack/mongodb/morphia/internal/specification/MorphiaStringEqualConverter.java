/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.mongodb.morphia.internal.specification;

import org.seedstack.business.specification.StringEqualSpecification;

import java.util.regex.Pattern;


public class MorphiaStringEqualConverter<T> extends MorphiaStringConverter<T, StringEqualSpecification> {
    @Override
    protected String buildRegexMatchingPart(String value) {
        return Pattern.quote(value);
    }

    @Override
    protected boolean isRegex() {
        return false;
    }
}