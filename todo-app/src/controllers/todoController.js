// src/controllers/todoController.js

const Todo = require('../models').Todo;

class TodoController {
  async getAll(req, res) {
    try {
      const todos = await Todo.findAll();
      res.render('index', { todos });
    } catch (error) {
      console.error(error);
      res.status(500).send('Internal Server Error');
    }
  }

  async create(req, res) {
    try {
      const { title, description } = req.body;
      const todo = await Todo.create({ title, description });
      res.redirect('/');
    } catch (error) {
      console.error(error);
      res.status(500).send('Internal Server Error');
    }
  }

  async update(req, res) {
    try {
      const { id } = req.params;
      const { title, description } = req.body;
      const todo = await Todo.findByPk(id);
      if (!todo) {
        return res.status(404).send('Todo not found');
      }
      await todo.update({ title, description });
      res.redirect('/');
    } catch (error) {
      console.error(error);
      res.status(500).send('Internal Server Error');
    }
  }

  async delete(req, res) {
    try {
      const { id } = req.params;
      const todo = await Todo.findByPk(id);
      if (!todo) {
        return res.status(404).send('Todo not found');
      }
      await todo.destroy();
      res.redirect('/');
    } catch (error) {
      console.error(error);
      res.status(500).send('Internal Server Error');
    }
  }
}

module.exports = TodoController;