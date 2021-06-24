class RecipesController < ApplicationController
  before_action :authenticate_user!, except: [:index, :show, :search]
  before_action :set_recipe, only: [:show, :edit, :update, :destroy]

  def index
    @recipe = Recipe.includes(:user).order('created_at DESC')
  end

  def new
    @recipe = Recipe.new
  end

  def create
    @recipe = Recipe.create(recipe_params)
    if @recipe.save

      redirect_to meals_path
    else
      render :new
    end
  end

  def edit
    redirect_to action: :index unless @recipe.user.id == current_user.id
  end

  def show
  end

  def update
    if @recipe.update(recipe_params)
      redirect_to meal_path
    else
      render :new
    end
  end

  def destroy
    if current_user.id == @recipe.user.id
      @recipe.destroy
      redirect_to meals_path
    else
      render :new
    end
  end

  private

  def recipe_params
    params.require(:recipe).permit(:word, :mean, :yomi, :image).merge(user_id: current_user.id)
  end

  def set_word
    @word = Word.find(params[:id])
  end
 
end
