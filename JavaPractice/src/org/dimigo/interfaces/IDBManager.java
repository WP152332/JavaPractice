/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces
 *		|_ IDBManager
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author			:	JunYongChoi
 * @version		:	1.0
 */
public interface IDBManager {
	final String ORACLE_DATABASE = "ORACLE";
	final String SYBASE_DATABASE = "SYBASE";
	
	void insert();
	void search();
	void update();
	void delete();
	
	static IDBManager getDBObject(String database) {
		if(database == null) return null; 
		IDBManager IDBM = null;
		if(database.equals(ORACLE_DATABASE)) {
			IDBM = new OracleDB();
		} else if (database.equals(SYBASE_DATABASE)){
			IDBM = new SybaseDB();
		}
		return IDBM;
	}
}
