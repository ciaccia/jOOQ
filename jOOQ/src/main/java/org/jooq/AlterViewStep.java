/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

// ...
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
import static org.jooq.SQLDialect.HSQLDB;
// ...
import static org.jooq.SQLDialect.POSTGRES;
// ...

import org.jooq.impl.DSL;

/**
 * The step in the <code>ALTER VIEW</code> where the action can be decided.
 *
 * @author Lukas Eder
 */
public interface AlterViewStep {

    /**
     * Specify a comment for a table using MySQL's syntax (which MySQL currently
     * doesn't support on views).
     *
     * @see DSL#commentOnView(Table)
     * @see DSLContext#commentOnView(Table)
     */
    @Support({ FIREBIRD, H2, HSQLDB, POSTGRES })
    AlterViewFinalStep comment(String comment);

    /**
     * Specify a comment for a table using MySQL's syntax (which MySQL currently
     * doesn't support on views).
     *
     * @see DSL#commentOnView(Table)
     * @see DSLContext#commentOnView(Table)
     */
    @Support({ FIREBIRD, H2, HSQLDB, POSTGRES })
    AlterViewFinalStep comment(Comment comment);

    /**
     * Add a <code>RENAME TO</code> clause to the <code>ALTER VIEW</code>
     * statement.
     */
    @Support({ HSQLDB, POSTGRES })
    AlterViewFinalStep renameTo(Table<?> newName);

    /**
     * Add a <code>RENAME TO</code> clause to the <code>ALTER VIEW</code>
     * statement.
     */
    @Support({ HSQLDB, POSTGRES })
    AlterViewFinalStep renameTo(Name newName);

    /**
     * Add a <code>RENAME TO</code> clause to the <code>ALTER VIEW</code>
     * statement.
     */
    @Support({ HSQLDB, POSTGRES })
    AlterViewFinalStep renameTo(String newName);
}
