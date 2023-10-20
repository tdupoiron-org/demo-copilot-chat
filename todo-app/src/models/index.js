// src/models/index.js

const mongoose = require('mongoose');
const todoSchema = require('./todo');

mongoose.connect('mongodb://localhost/todo-app', { useNewUrlParser: true, useUnifiedTopology: true });

const db = mongoose.connection;

db.on('error', console.error.bind(console, 'connection error:'));
db.once('open', function() {
  console.log('Connected to MongoDB');
});

const Todo = mongoose.model('Todo', todoSchema);

module.exports = { Todo };