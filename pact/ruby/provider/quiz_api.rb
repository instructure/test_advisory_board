require 'sinatra'
require 'json'

class QuizApi < Sinatra::Base
  get '/' do
    'hello world'
  end

  get '/quizzes/1' do
    # if you implement a database for Quiz API, then you'd want to query that db here
    content_type :json
    {
        "id": "1",
        "title": "Pop Quiz",
        "instructions": "Take the quiz. Good luck!",
        "context_id": "1",
        "shuffle_questions": true,
        "shuffle_answers": true
    }.to_json
  end
end
