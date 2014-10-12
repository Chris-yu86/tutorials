/**
 * This class is generated by jOOQ
 */
package spring.jooq.dao.generated;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>user_mgmt</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<spring.jooq.dao.generated.tables.records.UserDetailsRecord, java.lang.Integer> IDENTITY_USER_DETAILS = Identities0.IDENTITY_USER_DETAILS;
	public static final org.jooq.Identity<spring.jooq.dao.generated.tables.records.UserImageRecord, java.lang.Integer> IDENTITY_USER_IMAGE = Identities0.IDENTITY_USER_IMAGE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UserDetailsRecord> KEY_USER_DETAILS_PRIMARY = UniqueKeys0.KEY_USER_DETAILS_PRIMARY;
	public static final org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UserImageRecord> KEY_USER_IMAGE_PRIMARY = UniqueKeys0.KEY_USER_IMAGE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<spring.jooq.dao.generated.tables.records.UserDetailsRecord, java.lang.Integer> IDENTITY_USER_DETAILS = createIdentity(spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS, spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS.ID);
		public static org.jooq.Identity<spring.jooq.dao.generated.tables.records.UserImageRecord, java.lang.Integer> IDENTITY_USER_IMAGE = createIdentity(spring.jooq.dao.generated.tables.UserImage.USER_IMAGE, spring.jooq.dao.generated.tables.UserImage.USER_IMAGE.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UserDetailsRecord> KEY_USER_DETAILS_PRIMARY = createUniqueKey(spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS, spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS.ID);
		public static final org.jooq.UniqueKey<spring.jooq.dao.generated.tables.records.UserImageRecord> KEY_USER_IMAGE_PRIMARY = createUniqueKey(spring.jooq.dao.generated.tables.UserImage.USER_IMAGE, spring.jooq.dao.generated.tables.UserImage.USER_IMAGE.ID);
	}
}
