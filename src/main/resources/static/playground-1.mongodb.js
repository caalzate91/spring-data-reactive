// Renombrar la colección existente
db.messages.renameCollection("messages_backup")

// Crear una nueva colección limitada
db.createCollection("messages", { capped: true, size: 5242880, max: 5000 })

// Migrar los datos de la colección de respaldo a la nueva colección limitada
db.messages_backup.find().forEach(function(doc) {
    db.messages.insert(doc)
})

// Eliminar la colección de respaldo si ya no es necesaria
db.messages_backup.drop()