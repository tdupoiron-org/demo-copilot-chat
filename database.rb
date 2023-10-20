require 'mysql2'

# Connect to the MySQL database
client = Mysql2::Client.new(
  host: ENV['DB_HOST'],
  username: ENV['DB_USERNAME'],
  password: ENV['DB_PASSWORD'],
  database: ENV['DB_NAME']
)

def find_user_profile_by_name(name)
  results = client.query("SELECT * FROM user_profiles WHERE name = ?", name)
  # Print the results
  results.each do |row|
    puts row
  end
  # Close the database connection
  client.close
end

# Print the results
results.each do |row|
  puts row
end

# Close the database connection
client.close