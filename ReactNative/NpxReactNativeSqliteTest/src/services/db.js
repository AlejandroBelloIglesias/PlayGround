import { enablePromise, openDatabase, SQLiteDatabase } from 'react-native-sqlite-storage';
import { ToDoItem } from '../models/index';

const tableName = 'todoData';

enablePromise(true);

/**
 * Opens a connection to the database.
 * @returns {Promise<SQLiteDatabase>}
 */
export const getDBConnection = async () => {
  return openDatabase({name: 'todo-data.db', location: 'default'});
};

/**
 * Creates table if it doesn't exist.
 * @param db SQLiteDatabase object
 */
export const createTable = async (db) => {
    // create table if not exists
    const query = `CREATE TABLE IF NOT EXISTS ${tableName}(
          value TEXT NOT NULL
      );`;
    console.log(db);
    await db.executeSql(query);
  };


export const getTodoItems = async (db) => {
try {
    const todoItems = [];
    const results = await db.executeSql(`SELECT rowid as id,value FROM ${tableName}`);
    results.forEach(result => {
    for (let index = 0; index < result.rows.length; index++) {
        todoItems.push(result.rows.item(index))
    }
    });
    return todoItems;
} catch (error) {
    console.error(error);
    throw Error('Failed to get todoItems !!!');
}
};

export const saveTodoItems = async (db, todoItems) => {
const insertQuery =
    `INSERT OR REPLACE INTO ${tableName}(rowid, value) values` +
    todoItems.map(i => `(${i.id}, '${i.value}')`).join(',');

return db.executeSql(insertQuery);
};

export const deleteTodoItem = async (db, id) => {
const deleteQuery = `DELETE from ${tableName} where rowid = ${id}`;
await db.executeSql(deleteQuery);
};

export const deleteTable = async (db) => {
const query = `drop table ${tableName}`;

await db.executeSql(query);
};