class Triva{
    constructor(element, options={}){

        this.useCategoryIds = options.useCategoryIds
        //DataBase
        this.catgories = [];
        this.clues = {};

        //State
        this.currentClue = null;
        this.score = 0;

        //Elements
        this.boardElement = element.querySelector(".board");
        this.scoreCountElement = element.querySelector(".score-count");
        this.scoreCountElement1 = element.querySelector(".score2-count");
        this.formElement = element.querySelector("form");
        this.inputElement = element.querySelector("input[name=user-answer]");
        this.modalElement = element.querySelector(".card-modal");
        this.clueTextElement = element.querySelector(".clue-text");
        this.resultElement = element.querySelector(".result");
        this.resultTextElement = element.querySelector(".correct-answer-text");
        this.successTextElement = element.querySelector(".success");
        this.failTextElement = element.querySelector(".fail");
    }

    initGame(){
        this.updateScore(0);
    }
    updateScore(change){
        this.score += change;
        this.scoreCountElement.textContent = this.score;
        this.scoreCountElement1.textContent = this.score;
    }
}

const game = new Triva( document.querySelector( ".app"), {});
game.initGame();

