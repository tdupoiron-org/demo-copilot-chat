// src/controllers/index.js

class IndexController {
  /**
   * Handles the root route of the application.
   * @param {Object} req - The request object.
   * @param {Object} res - The response object.
   */
  getIndex(req, res) {
    res.render('index', { title: 'Todo App' });
  }
}

module.exports = IndexController;