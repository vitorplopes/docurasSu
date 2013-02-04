databaseChangeLog = {

	changeSet(author: "Madruga (generated)", id: "1359940786868-1") {
		createTable(tableName: "PERSISTENT_SESSION") {
			column(name: "ID", type: "VARCHAR(255)") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_3")
			}

			column(name: "CREATION_TIME", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "INVALIDATED", type: "BOOLEAN") {
				constraints(nullable: "false")
			}

			column(name: "LAST_ACCESSED_TIME", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "MAX_INACTIVE_INTERVAL", type: "INT") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Madruga (generated)", id: "1359940786868-2") {
		createTable(tableName: "PERSISTENT_SESSION_ATTRIBUTE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_F")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "SESSION_ID", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Madruga (generated)", id: "1359940786868-3") {
		createTable(tableName: "PERSISTENT_SESSION_ATTRIBUTE_VALUE") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_5")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "ATTRIBUTE_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "SERIALIZED", type: "VARBINARY(20000)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Madruga (generated)", id: "1359940786868-4") {
		createTable(tableName: "PRODUTO") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_1")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DATE_CREATED", type: "DATE") {
				constraints(nullable: "false")
			}

			column(name: "DESCRICAO", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "NOME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "PRECO", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "RESUMO", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "TAGS", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Madruga (generated)", id: "1359940786868-5") {
		addForeignKeyConstraint(baseColumnNames: "SESSION_ID", baseTableName: "PERSISTENT_SESSION_ATTRIBUTE", baseTableSchemaName: "PUBLIC", constraintName: "FK50C6048B92381D29", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PERSISTENT_SESSION", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	changeSet(author: "Madruga (generated)", id: "1359940786868-6") {
		addForeignKeyConstraint(baseColumnNames: "ATTRIBUTE_ID", baseTableName: "PERSISTENT_SESSION_ATTRIBUTE_VALUE", baseTableSchemaName: "PUBLIC", constraintName: "FK1EFE24BDF830ABF5", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PERSISTENT_SESSION_ATTRIBUTE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}

	include file: 'Produto-propriedade'

	include file: 'Produto-propriedade.groovy'
}
