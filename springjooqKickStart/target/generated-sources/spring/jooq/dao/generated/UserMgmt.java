/**
 * This class is generated by jOOQ
 */
package spring.jooq.dao.generated;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserMgmt extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 203377231;

	/**
	 * The singleton instance of <code>user_mgmt</code>
	 */
	public static final UserMgmt USER_MGMT = new UserMgmt();

	/**
	 * No further instances allowed
	 */
	private UserMgmt() {
		super("user_mgmt");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS,
			spring.jooq.dao.generated.tables.UserImage.USER_IMAGE);
	}
}
