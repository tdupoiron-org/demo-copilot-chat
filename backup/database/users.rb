require 'mysql2'

# Connect to the MySQL database
client = Mysql2::Client.new(
  host: ENV['DB_HOST'],
  username: ENV['DB_USERNAME'],
  password: ENV['DB_PASSWORD'],
  database: ENV['DB_NAME']
)

def find_user_profile_by_name(name)
  query = "SELECT * FROM user_profiles WHERE name = ?"
  result = client.query(query, name)
  result.each do |row|
    puts row
  end
end

# Print the results
result.each do |row|
  puts row
end