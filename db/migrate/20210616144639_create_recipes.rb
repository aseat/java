class CreateRecipes < ActiveRecord::Migration[6.1]
  def change
    create_table :recipes do |t|

      t.timestamps
      t.string :title, null:false
      t.text :text, null: false
      t.references :user, null:false, foreign_key: true
    end
  end
end
